package com.question4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WorkersList {

	public static void main(String[] args) {

		List<Workers> worker = new ArrayList<Workers>();
		DailyWorker w = new DailyWorker();
		SalariedWorker s = new SalariedWorker();
		worker.add(new DailyWorker(101, "Meena", "D", 30,w.pay()));
		worker.add(new SalariedWorker(201, "Kalai", "S", 40,s.pay()));
		worker.add(new DailyWorker(102, "Harini", "D", 40, w.pay()));
		worker.add(new SalariedWorker(202, "Hema", "S", 40, s.pay()));
		worker.add(new DailyWorker(103, "Siva", "D", 35, w.pay()));

		System.out.println("Origanal data");
		System.out.println(worker);

		System.out.println();
		Collections.sort(worker, new Comparator<Workers>() {

			@Override
			public int compare(Workers o1, Workers o2) {
				if (o1.getWorkedhrs()> o2.getWorkedhrs())
					return 1;
				else
					return -1;
			}

		});
		System.out.println("Sorted data");
		System.out.println(worker);
	}

}
