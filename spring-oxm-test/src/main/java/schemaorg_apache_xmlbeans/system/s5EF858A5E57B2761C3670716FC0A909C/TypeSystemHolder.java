package schemaorg_apache_xmlbeans.system.s5EF858A5E57B2761C3670716FC0A909C;

import java.lang.reflect.Constructor;
import org.apache.xmlbeans.SchemaTypeSystem;

public class TypeSystemHolder {
	public static final SchemaTypeSystem typeSystem = loadTypeSystem();

	private static final SchemaTypeSystem loadTypeSystem() {
		try {
//			return (SchemaTypeSystem) Class
//					.forName("org.apache.xmlbeans.impl.schema.SchemaTypeSystemImpl", true,
//							class$schemaorg_apache_xmlbeans$system$s5EF858A5E57B2761C3670716FC0A909C$TypeSystemHolder
//									.getClassLoader())
//					.getConstructor(new Class[] { Class.class }).newInstance(new Object[] { TypeSystemHolder.class });
			return (SchemaTypeSystem) Class
					.forName("org.apache.xmlbeans.impl.schema.SchemaTypeSystemImpl", true,
							TypeSystemHolder.class
							.getClassLoader())
					.getConstructor(new Class[] { Class.class }).newInstance(new Object[] { TypeSystemHolder.class });
		} catch (ClassNotFoundException localClassNotFoundException) {
			throw new RuntimeException(
					"Cannot load org.apache.xmlbeans.impl.SchemaTypeSystemImpl: make sure xbean.jar is on the classpath.",
					localClassNotFoundException);
		} catch (Exception localException) {
			throw new RuntimeException("Could not instantiate SchemaTypeSystemImpl (" + localException.toString()
					+ "): is the version of xbean.jar correct?", localException);
		}
	}
}
