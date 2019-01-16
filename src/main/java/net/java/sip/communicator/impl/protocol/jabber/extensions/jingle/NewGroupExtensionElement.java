package net.java.sip.communicator.impl.protocol.jabber.extensions.jingle;

public class NewGroupExtensionElement extends NewAbstractExtensionElement
{

    public static final String ELEMENT_NAME = "group";

    public static final String NAMESPACE = "urn:xmpp:jingle:apps:grouping:0";

    public static final String SEMANTICS_ATTR_NAME = "semantics";


    /**
     * Creates a new {@link NewCandidatePacketExtension}
     */
    public NewGroupExtensionElement()
    {
        super(ELEMENT_NAME, NAMESPACE);
    }



    public void setSemantics(String sem) {
        super.setAttribute(SEMANTICS_ATTR_NAME, sem);
    }

    public String getSemantics() {
        return super.getAttributeAsString(SEMANTICS_ATTR_NAME);
    }

}
