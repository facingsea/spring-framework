package org.springframework.samples.flight.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlLong;
import org.apache.xmlbeans.impl.values.TypeStore;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.springframework.samples.flight.FlightType;

public class FlightTypeImpl extends XmlComplexContentImpl implements FlightType {
	private static final long serialVersionUID = 1L;
	private static final QName NUMBER$0 = new QName("http://samples.springframework.org/flight", "number");

	public FlightTypeImpl(SchemaType paramSchemaType) {
		super(paramSchemaType);
	}

	public long getNumber() {
		synchronized (monitor()) {
			check_orphaned();
			SimpleValue localSimpleValue = null;
			localSimpleValue = (SimpleValue) get_store().find_element_user(NUMBER$0, 0);
			if (localSimpleValue == null) {
				return 0L;
			}
			return localSimpleValue.getLongValue();
		}
	}

	public XmlLong xgetNumber() {
		synchronized (monitor()) {
			check_orphaned();
			XmlLong localXmlLong = null;
			localXmlLong = (XmlLong) get_store().find_element_user(NUMBER$0, 0);
			return localXmlLong;
		}
	}

	public void setNumber(long paramLong) {
		synchronized (monitor()) {
			check_orphaned();
			SimpleValue localSimpleValue = null;
			localSimpleValue = (SimpleValue) get_store().find_element_user(NUMBER$0, 0);
			if (localSimpleValue == null) {
				localSimpleValue = (SimpleValue) get_store().add_element_user(NUMBER$0);
			}
			localSimpleValue.setLongValue(paramLong);
		}
	}

	public void xsetNumber(XmlLong paramXmlLong) {
		synchronized (monitor()) {
			check_orphaned();
			XmlLong localXmlLong = null;
			localXmlLong = (XmlLong) get_store().find_element_user(NUMBER$0, 0);
			if (localXmlLong == null) {
				localXmlLong = (XmlLong) get_store().add_element_user(NUMBER$0);
			}
			localXmlLong.set(paramXmlLong);
		}
	}
}
