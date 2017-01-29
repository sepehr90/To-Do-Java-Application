package Model;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class DBJaxb {

	private Marshaller jaxbMarshaller;
	private Unmarshaller jaxbUnmarshaller;
	private File itemDB;
	private Items items = new Items();


	/**
	 * @author Jens Lundin
	 * 
	 * Create JAXB context of Items class and instantiate marshaller.
	 * 
	 */
	public DBJaxb() {
		
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Items.class);
			jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			itemDB = new File("./ItemsDB.xml");
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @author Jens Lundin
	 * 
	 * Load variables from XML file (itemDB) to Items.
	 * 
	 * @return Items if itemDB exists, null otherwise.
	 * 
	 */
	public Items loadItems() {
		if ( itemDB.exists() && !itemDB.isDirectory()) {
			try {
				items = (Items) jaxbUnmarshaller.unmarshal(itemDB);
			} catch (JAXBException e) {
				e.printStackTrace();
			}
		}
		return items;
}
	
	/**
	 * @author Jens Lundin
	 * 
	 * Store Items variables to XML file (itemDB).
	 * 
	 */
	public void storeItems() {
			try {
				jaxbMarshaller.marshal(items, itemDB);
			} catch (JAXBException e) {
				e.printStackTrace();
			}
	}
}
