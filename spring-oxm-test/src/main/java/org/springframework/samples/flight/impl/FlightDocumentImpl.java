package org.springframework.samples.flight.impl;

import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.values.TypeStore;
import org.apache.xmlbeans.impl.values.XmlComplexContentImpl;
import org.springframework.samples.flight.FlightDocument;
import org.springframework.samples.flight.FlightType;

public class FlightDocumentImpl extends XmlComplexContentImpl implements FlightDocument {
	private static final long serialVersionUID = 1L;
	private static final QName FLIGHT$0 = new QName("http://samples.springframework.org/flight", "flight");

	public FlightDocumentImpl(SchemaType paramSchemaType) {
		super(paramSchemaType);
	}

	public FlightType getFlight() {
		synchronized (monitor()) {
			check_orphaned();
			FlightType localFlightType = null;
			localFlightType = (FlightType) get_store().find_element_user(FLIGHT$0, 0);
			if (localFlightType == null) {
				return null;
			}
			return localFlightType;
		}
	}

	public void setFlight(FlightType paramFlightType) {
		synchronized (monitor()) {
			check_orphaned();
			FlightType localFlightType = null;
			localFlightType = (FlightType) get_store().find_element_user(FLIGHT$0, 0);
			if (localFlightType == null) {
				localFlightType = (FlightType) get_store().add_element_user(FLIGHT$0);
			}
			localFlightType.set(paramFlightType);
		}
	}

	public FlightType addNewFlight() {
		synchronized (monitor()) {
			check_orphaned();
			FlightType localFlightType = null;
			localFlightType = (FlightType) get_store().add_element_user(FLIGHT$0);
			return localFlightType;
		}
	}
}
