package com.dervarex;


import com.dervarex.filter.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class ZipTool {
	public static String version = "0.0.4";

	public static void main(String[] args) {
		CLIContext applicationContext = new CLIContext();
		CLIFilter executionFilter = new ExecutionFilter(null);
		CLIFilter fileFilter = new FileFilter(executionFilter);
		CLIFilter optionalArgumentsWrapper = new OptionalArgumentsWrapper(fileFilter);
		CLIFilter loggingFilter = new LoggingFilter(optionalArgumentsWrapper);
		CLIFilter functionFilter = new FunctionFilter(loggingFilter, new ZipService());
		CLIFilter primaryFilter = new PrimaryFilter(functionFilter);
		primaryFilter.doSetup(Arrays.stream(args).collect(Collectors.toCollection(LinkedList::new)), applicationContext);
	}

	public static String getVersion() {
		return version;
	}

}