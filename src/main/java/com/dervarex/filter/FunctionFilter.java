package com.dervarex.filter;

import com.dervarex.CLIContext;
import com.dervarex.ZipService;

import java.util.Queue;
import java.util.function.BiConsumer;

public class FunctionFilter extends CLIFilter {
    ZipService zipService;

    public FunctionFilter(CLIFilter next, ZipService zipService) {
        super(next);
        this.zipService = zipService;
    }


    @Override
    protected void doFilterSpecific(Queue<String> args, CLIContext cliContext) {
        BiConsumer<String, String[]> consumer = null;
        String argument = args.poll();
        // can't produce null pointer exception because PrimaryFilter will stop filter chain in the case of null
        switch (argument) {
            case "-zip":
            case "zip":
            case "-z":
                consumer = (name, paths) -> zipService.pack(name, paths);
                break;
            case "-unzip":
            case "unzip":
            case "-uz":
                consumer = (name, paths) -> zipService.unpack(name, paths);
                break;
            case "-update":
            case "update":
            case "-u":
                consumer = (name, paths) -> zipService.update(name, paths);
                break;
            case "-remove":
            case "remove":
            case "-r":
                consumer = (name, paths) -> zipService.remove(name, paths);
                break;
            default:
                throw new RuntimeException("Not existing Filter argument, got: " + argument);
        }
        cliContext.setFunction(consumer);
    }
}
