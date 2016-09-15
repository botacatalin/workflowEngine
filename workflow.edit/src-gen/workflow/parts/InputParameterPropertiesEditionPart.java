/**
 * Generated with Acceleo
 */
package workflow.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface InputParameterPropertiesEditionPart {

	/**
	 * @return the option
	 * 
	 */
	public String getOption();

	/**
	 * Defines a new option
	 * @param newValue the new option to set
	 * 
	 */
	public void setOption(String newValue);


	/**
	 * @return the data
	 * 
	 */
	public String getData();

	/**
	 * Defines a new data
	 * @param newValue the new data to set
	 * 
	 */
	public void setData(String newValue);


	/**
	 * @return the link_to_outputparameter
	 * 
	 */
	public EObject getLink_to_outputparameter();

	/**
	 * Init the link_to_outputparameter
	 * @param settings the combo setting
	 */
	public void initLink_to_outputparameter(EObjectFlatComboSettings settings);

	/**
	 * Defines a new link_to_outputparameter
	 * @param newValue the new link_to_outputparameter to set
	 * 
	 */
	public void setLink_to_outputparameter(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setLink_to_outputparameterButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the link_to_outputparameter edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToLink_to_outputparameter(ViewerFilter filter);

	/**
	 * Adds the given filter to the link_to_outputparameter edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToLink_to_outputparameter(ViewerFilter filter);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
