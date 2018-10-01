package org.jsoncast;

import org.xml.sax.ContentHandler;
import org.castor.core.nature.BaseNature;
import org.castor.core.nature.PropertyHolder;

public class ContentHandlerNature extends BaseNature{
	
	private ContentHandler handler;
	
	public ContentHandlerNature(PropertyHolder holder, ContentHandler handler) {
		super(holder);
		this.handler = handler;
	}

	@Override
	public String getId() {
		return this.getClass().getName();
	}
	
	ContentHandler getContentHandler() {
		return this.handler;
	}

}
