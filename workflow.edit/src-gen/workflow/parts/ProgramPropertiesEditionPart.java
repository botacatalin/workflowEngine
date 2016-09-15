/**
 * Generated with Acceleo
 */
package workflow.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface ProgramPropertiesEditionPart {



	/**
	 * Init the parameters
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initParameters(ReferencesTableSettings settings);

	/**
	 * Update the parameters
	 * @param newValue the parameters to update
	 * 
	 */
	public void updateParameters();

	/**
	 * Adds the given filter to the parameters edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToParameters(ViewerFilter filter);

	/**
	 * Adds the given filter to the parameters edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToParameters(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the parameters table
	 * 
	 */
	public boolean isContainedInParametersTable(EObject element);


	/**
	 * @return the name_exec
	 * 
	 */
	public String getName_exec();

	/**
	 * Defines a new name_exec
	 * @param newValue the new name_exec to set
	 * 
	 */
	public void setName_exec(String newValue);


	/**
	 * @return the description
	 * 
	 */
	public String getDescription();

	/**
	 * Defines a new description
	 * @param newValue the new description to set
	 * 
	 */
	public void setDescription(String newValue);





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
