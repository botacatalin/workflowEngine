/**
 * Generated with Acceleo
 */
package workflow.parts;

/**
 * 
 * 
 */
public class WorkflowViewsRepository {

	public static final int SWT_KIND = 0;

	public static final int FORM_KIND = 1;


	/**
	 * Workflow view descriptor
	 * 
	 */
	public static class Workflow_ {
		public static class Properties {
	
			
			public static String name = "workflow::Workflow_::properties::name";
			
			
			public static String recipes = "workflow::Workflow_::properties::recipes";
			
	
		}
	
	}

	/**
	 * Recipe view descriptor
	 * 
	 */
	public static class Recipe {
		public static class Properties {
	
			
			public static String name = "workflow::Recipe::properties::name";
			
			
			public static String commands = "workflow::Recipe::properties::commands";
			
	
		}
	
	}

	/**
	 * Condition view descriptor
	 * 
	 */
	public static class Condition {
		public static class Properties {
	
			
			public static String description = "workflow::Condition::properties::description";
			
			
			public static String expression = "workflow::Condition::properties::expression";
			
	
		}
	
	}

	/**
	 * Program view descriptor
	 * 
	 */
	public static class Program {
		public static class Properties {
	
			
			public static String parameters = "workflow::Program::properties::parameters";
			
			
			public static String name_exec = "workflow::Program::properties::name_exec";
			
			
			public static String description = "workflow::Program::properties::description";
			
	
		}
	
	}

	/**
	 * SimpleCommand view descriptor
	 * 
	 */
	public static class SimpleCommand {
		public static class Properties {
	
			
			public static String description = "workflow::SimpleCommand::properties::description";
			
			
			public static String programs = "workflow::SimpleCommand::properties::programs";
			
	
		}
	
	}

	/**
	 * InputParameter view descriptor
	 * 
	 */
	public static class InputParameter {
		public static class Properties {
	
			
			public static String option = "workflow::InputParameter::properties::option";
			
			
			public static String data = "workflow::InputParameter::properties::data";
			
			
			public static String link_to_outputparameter = "workflow::InputParameter::properties::link_to_outputparameter";
			
	
		}
	
	}

	/**
	 * OutputParameter view descriptor
	 * 
	 */
	public static class OutputParameter {
		public static class Properties {
	
			
			public static String option = "workflow::OutputParameter::properties::option";
			
			
			public static String data = "workflow::OutputParameter::properties::data";
			
			
			public static String link_to_inputparameter = "workflow::OutputParameter::properties::link_to_inputparameter";
			
	
		}
	
	}

}
