package com.orctom.gradle.plugins.was.model;

import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Shell Command
 * Created by hao on 11/11/15.
 */
public class Command {

	private String executable;
	private String workingDir;
	private Map<String, String> args = Maps.newLinkedHashMap();

	public Command() {
	}

	public Command(String executable, String workingDir) {
		this.executable = executable;
		this.workingDir = workingDir;
	}

	public String getExecutable() {
		return executable;
	}

	public void setExecutable(String executable) {
		this.executable = executable;
	}

	public String getWorkingDir() {
		return workingDir;
	}

	public void setWorkingDir(String workingDir) {
		this.workingDir = workingDir;
	}

	public Map<String, String> getArgs() {
		return args;
	}

	public void setArgs(Map<String, String> args) {
		this.args = args;
	}

	public void addArg(String name, String value) {
		args.put(name, value);
	}

	public List<String> getArgsAsList() {
		List<String> list = new ArrayList<String>(2 * args.size());
		for (Map.Entry<String, String> entry : args.entrySet()) {
			list.add(entry.getKey());
			list.add(entry.getValue());
		}
		return list;
	}

	public List<String> getArgEntriesAsList() {
		List<String> list = new ArrayList<String>(args.size());
		for (Map.Entry<String, String> entry : args.entrySet()) {
			list.add(entry.getKey() + " " + entry.getValue());
		}
		return list;
	}
}