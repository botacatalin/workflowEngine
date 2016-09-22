package my.generator.workflow.design.services;

import java.util.List;


import org.eclipse.emf.ecore.EObject;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.base.Predicate;

public class WorkflowDiagramServices {
	
	public Integer getExecutionOrder(final EObject element) {
		Predicate<EObject> predicate = new Predicate<EObject>() {
			public boolean apply(EObject input) {
				return input.getClass().getName().equals(element.getClass().getName());
			}
		};
		final List<EObject> existingElements = Lists.newArrayList(Iterables.filter(element.eContainer()
				.eContents(), predicate));

		
		return existingElements.size();
		
	}
	
}
