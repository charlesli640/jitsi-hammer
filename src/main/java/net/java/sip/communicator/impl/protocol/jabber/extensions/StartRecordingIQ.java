package net.java.sip.communicator.impl.protocol.jabber.extensions;

import org.jivesoftware.smack.packet.IQ;

import java.util.ArrayList;
import java.util.List;

public class StartRecordingIQ extends IQ  {
    /**
     * The name of the "jibri" XML element
     */
    public static final String ELEMENT_NAME = "jibri";

    /**
     * The namespace for the XML element
     */
    public static final String NAMESPACE = "http://jitsi.org/protocol/jibri";

    /**
     * The name of the attribute that contains the room URL
     */
    public static final String RECORDING_MODE_ATTR_NAME = "recording_mode";

    /**
     * The name of the attribute that contains machine UID
     */
    public static final String ACTION_ATTR_NAME = "action";

    public static final String SESSION_ID_ATTR_NAME = "session_id";

    public static final String APP_DATA_ATTR_NAME = "app_data";


    private String sessionID;

    /**
     * The list of conference property packet extension for the properties
     * associated with this conference
     */
    private List<ConferencePropertyPacketExtension> conferenceProperties
            = new ArrayList<ConferencePropertyPacketExtension>();

    public StartRecordingIQ()
    {
        super(ELEMENT_NAME, NAMESPACE);
    }


    @Override
    public IQ.IQChildElementXmlStringBuilder getIQChildElementBuilder(IQ.IQChildElementXmlStringBuilder xml)
    {
        xml.attribute(ACTION_ATTR_NAME, "start");
        xml.attribute(RECORDING_MODE_ATTR_NAME, "file");
        xml.attribute(APP_DATA_ATTR_NAME, "");
        xml.attribute("streamid", "");
        xml.attribute("you_tube_broadcast_id", "");

        xml.attribute(SESSION_ID_ATTR_NAME, sessionID);

        return xml;
    }


    public void setSessionID(String sid) {
        this.sessionID = sid;
    }
}
