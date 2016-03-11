
package org.transscript.runtime;

public interface Ref
{

	/** Safe reference counting: check for null value */
	@SuppressWarnings("unchecked")
	static <T extends Ref> T ref(T ref)
	{
		return (T) ref.ref();
	} 
	
	default Ref ref()
	{
		return this;
	}

	default void release()
	{}


}
