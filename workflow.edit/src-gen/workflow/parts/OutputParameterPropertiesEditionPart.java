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
public interface OutputParameterPropertiesEditionPart {

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
	 * @return the link_to_inputparameter
	 * 
	 */
	public EObject getLink_to_inputparameter();

	/**
	 * Init the link_to_inputparameter
	 * @param settings the combo setting
	 */
	public void initLink_to_inputparameter(EObjectFlatComboSettings settings);

	/**
	 * Defines a new link_to_inputparameter
	 * @param newValue the new link_to_inputparameter to set
	 * 
	 */
	public void setLink_to_inputparameter(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setLink_to_inputparameterButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the link_to_inputparameter edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToLink_to_inputparameter(ViewerFilter filter);

	/**
	 * Adds the given filter to the link_to_inputparameter edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToLink_to_inputparameter(ViewerFilter filter);





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
