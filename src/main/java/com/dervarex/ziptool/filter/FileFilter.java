package com.dervarex.ziptool.filter;

import com.dervarex.ziptool.CLIContext;

import java.util.Queue;

public class FileFilter extends CLIFilter {


	public FileFilter(CLIFilter next) {
		super(next);
	}

	@Override
	protected void doFilterSpecific(Queue<String> args, CLIContext cliContext) {
		String zipName = args.poll();
		String[] files = args.toArray(new String[]{});

		cliContext.setArchiveName(zipName);
		cliContext.setFilenames(files);
	}
}
