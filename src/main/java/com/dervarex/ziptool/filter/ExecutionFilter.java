package com.dervarex.ziptool.filter;

import com.dervarex.ziptool.CLIContext;

import java.util.Queue;

public class ExecutionFilter extends CLIFilter {

    public ExecutionFilter(CLIFilter next) {
        super(next);
    }

    @Override
    protected void doFilterSpecific(Queue<String> args, CLIContext cliContext) {
        cliContext.getFunction().accept(cliContext.getArchiveName(), cliContext.getFilenames());
    }
}
