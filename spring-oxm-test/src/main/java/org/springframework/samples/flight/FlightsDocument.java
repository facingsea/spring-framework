package org.springframework.samples.flight;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.stream.XMLStreamReader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SchemaTypeLoader;
import org.apache.xmlbeans.SchemaTypeSystem;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public abstract interface FlightsDocument extends XmlObject {
	//public static final SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader((1.class$org$springframework$samples$flight$FlightsDocument == null ? (1.class$org$springframework$samples$flight$FlightsDocument = 1.class$("org.springframework.samples.flight.FlightsDocument")) : 1.class$org$springframework$samples$flight$FlightsDocument).getClassLoader(), "schemaorg_apache_xmlbeans.system.s5EF858A5E57B2761C3670716FC0A909C").resolveHandle("flights4eb9doctype");
	public static final SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(FlightsDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5EF858A5E57B2761C3670716FC0A909C").resolveHandle("flights4eb9doctype");

	public abstract Flights getFlights();

	public abstract void setFlights(Flights paramFlights);

	public abstract Flights addNewFlights();

	public static final class Factory {
		public static FlightsDocument newInstance() {
			return (FlightsDocument) XmlBeans.getContextTypeLoader().newInstance(FlightsDocument.type, null);
		}

		public static FlightsDocument newInstance(XmlOptions paramXmlOptions) {
			return (FlightsDocument) XmlBeans.getContextTypeLoader().newInstance(FlightsDocument.type, paramXmlOptions);
		}

		public static FlightsDocument parse(String paramString) throws XmlException {
			return (FlightsDocument) XmlBeans.getContextTypeLoader().parse(paramString, FlightsDocument.type, null);
		}

		public static FlightsDocument parse(String paramString, XmlOptions paramXmlOptions) throws XmlException {
			return (FlightsDocument) XmlBeans.getContextTypeLoader().parse(paramString, FlightsDocument.type,
					paramXmlOptions);
		}

		public static FlightsDocument parse(File paramFile) throws XmlException, IOException {
			return (FlightsDocument) XmlBeans.getContextTypeLoader().parse(paramFile, FlightsDocument.type, null);
		}

		public static FlightsDocument parse(File paramFile, XmlOptions paramXmlOptions)
				throws XmlException, IOException {
			return (FlightsDocument) XmlBeans.getContextTypeLoader().parse(paramFile, FlightsDocument.type,
					paramXmlOptions);
		}

		public static FlightsDocument parse(URL paramURL) throws XmlException, IOException {
			return (FlightsDocument) XmlBeans.getContextTypeLoader().parse(paramURL, FlightsDocument.type, null);
		}

		public static FlightsDocument parse(URL paramURL, XmlOptions paramXmlOptions) throws XmlException, IOException {
			return (FlightsDocument) XmlBeans.getContextTypeLoader().parse(paramURL, FlightsDocument.type,
					paramXmlOptions);
		}

		public static FlightsDocument parse(InputStream paramInputStream) throws XmlException, IOException {
			return (FlightsDocument) XmlBeans.getContextTypeLoader().parse(paramInputStream, FlightsDocument.type,
					null);
		}

		public static FlightsDocument parse(InputStream paramInputStream, XmlOptions paramXmlOptions)
				throws XmlException, IOException {
			return (FlightsDocument) XmlBeans.getContextTypeLoader().parse(paramInputStream, FlightsDocument.type,
					paramXmlOptions);
		}

		public static FlightsDocument parse(Reader paramReader) throws XmlException, IOException {
			return (FlightsDocument) XmlBeans.getContextTypeLoader().parse(paramReader, FlightsDocument.type, null);
		}

		public static FlightsDocument parse(Reader paramReader, XmlOptions paramXmlOptions)
				throws XmlException, IOException {
			return (FlightsDocument) XmlBeans.getContextTypeLoader().parse(paramReader, FlightsDocument.type,
					paramXmlOptions);
		}

		public static FlightsDocument parse(XMLStreamReader paramXMLStreamReader) throws XmlException {
			return (FlightsDocument) XmlBeans.getContextTypeLoader().parse(paramXMLStreamReader, FlightsDocument.type,
					null);
		}

		public static FlightsDocument parse(XMLStreamReader paramXMLStreamReader, XmlOptions paramXmlOptions)
				throws XmlException {
			return (FlightsDocument) XmlBeans.getContextTypeLoader().parse(paramXMLStreamReader, FlightsDocument.type,
					paramXmlOptions);
		}

		public static FlightsDocument parse(Node paramNode) throws XmlException {
			return (FlightsDocument) XmlBeans.getContextTypeLoader().parse(paramNode, FlightsDocument.type, null);
		}

		public static FlightsDocument parse(Node paramNode, XmlOptions paramXmlOptions) throws XmlException {
			return (FlightsDocument) XmlBeans.getContextTypeLoader().parse(paramNode, FlightsDocument.type,
					paramXmlOptions);
		}

		/**
		 * @deprecated
		 */
		public static FlightsDocument parse(XMLInputStream paramXMLInputStream)
				throws XmlException, XMLStreamException {
			return (FlightsDocument) XmlBeans.getContextTypeLoader().parse(paramXMLInputStream, FlightsDocument.type,
					null);
		}

		/**
		 * @deprecated
		 */
		public static FlightsDocument parse(XMLInputStream paramXMLInputStream, XmlOptions paramXmlOptions)
				throws XmlException, XMLStreamException {
			return (FlightsDocument) XmlBeans.getContextTypeLoader().parse(paramXMLInputStream, FlightsDocument.type,
					paramXmlOptions);
		}

		/**
		 * @deprecated
		 */
		public static XMLInputStream newValidatingXMLInputStream(XMLInputStream paramXMLInputStream)
				throws XmlException, XMLStreamException {
			return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(paramXMLInputStream,
					FlightsDocument.type, null);
		}

		/**
		 * @deprecated
		 */
		public static XMLInputStream newValidatingXMLInputStream(XMLInputStream paramXMLInputStream,
				XmlOptions paramXmlOptions) throws XmlException, XMLStreamException {
			return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(paramXMLInputStream,
					FlightsDocument.type, paramXmlOptions);
		}
	}

	public static abstract interface Flights extends XmlObject {
		//public static final SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader((FlightsDocument.1.class$org$springframework$samples$flight$FlightsDocument$Flights == null ? (FlightsDocument.1.class$org$springframework$samples$flight$FlightsDocument$Flights = FlightsDocument.1.class$("org.springframework.samples.flight.FlightsDocument$Flights")) : FlightsDocument.1.class$org$springframework$samples$flight$FlightsDocument$Flights).getClassLoader(), "schemaorg_apache_xmlbeans.system.s5EF858A5E57B2761C3670716FC0A909C").resolveHandle("flightseba8elemtype");
		public static final SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(FlightsDocument.Flights.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s5EF858A5E57B2761C3670716FC0A909C").resolveHandle("flightseba8elemtype");

		public abstract FlightType[] getFlightArray();

		public abstract FlightType getFlightArray(int paramInt);

		public abstract int sizeOfFlightArray();

		public abstract void setFlightArray(FlightType[] paramArrayOfFlightType);

		public abstract void setFlightArray(int paramInt, FlightType paramFlightType);

		public abstract FlightType insertNewFlight(int paramInt);

		public abstract FlightType addNewFlight();

		public abstract void removeFlight(int paramInt);

		public static final class Factory {
			public static FlightsDocument.Flights newInstance() {
				return (FlightsDocument.Flights) XmlBeans.getContextTypeLoader()
						.newInstance(FlightsDocument.Flights.type, null);
			}

			public static FlightsDocument.Flights newInstance(XmlOptions paramXmlOptions) {
				return (FlightsDocument.Flights) XmlBeans.getContextTypeLoader()
						.newInstance(FlightsDocument.Flights.type, paramXmlOptions);
			}
		}
	}
}
