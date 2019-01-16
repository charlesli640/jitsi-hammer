package net.java.sip.communicator.impl.protocol.jabber.extensions.jingle;

public class NewBundlePacketExtension extends NewAbstractExtensionElement {
    /**
     * The name of the element.
     */
    public static final String ELEMENT_NAME = "rtcp-mux";

    public static final String NAMESPACE = "http://estos.de/ns/bundle";

    /**
     * Creates a new instance of <tt>NewRtcpmuxPacketExtension</tt>.
     */
    public NewBundlePacketExtension()
    {
        super(ELEMENT_NAME, NAMESPACE);
    }
}
