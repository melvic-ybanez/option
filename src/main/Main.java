package main;

import java.util.ArrayList;
import java.util.List;

import option.DefaultFunc;
import option.MapFunc;
import option.Option;
import option.OptionFactory;

public class Main {
	public static void main(String[] args) {
		Option<String> opt = OptionFactory.build("dfd");
		int length = opt.map(new MapFunc<String, Integer>() {
			@Override public Integer mapTo(String str) {
				return str.length();
			}
		}).getOrElse(new DefaultFunc<Integer>() {
			@Override public Integer value() {
				return 78;
			}
		});
		
		System.out.println(length);
		System.out.println(opt.getValue());
		
		
		System.out.println(opt.isEmpty());
	}
}
