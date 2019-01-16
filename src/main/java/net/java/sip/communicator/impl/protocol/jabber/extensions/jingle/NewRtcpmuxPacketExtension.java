/*
 * Jitsi, the OpenSource Java VoIP and Instant Messaging client.
 *
 * Copyright @ 2017 Atlassian Pty Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.java.sip.communicator.impl.protocol.jabber.extensions.jingle;

/**
 * An 'rtcp-mux' extension.
 * @author Boris Grozev
 * @author Brian Baldino
 */
public class NewRtcpmuxPacketExtension
        extends NewAbstractExtensionElement
{
    /**
     * The name of the element.
     */
    public static final String ELEMENT_NAME = "rtcp-mux";

    /**
     * Creates a new instance of <tt>NewRtcpmuxPacketExtension</tt>.
     */
    public NewRtcpmuxPacketExtension()
    {
        super(ELEMENT_NAME, null);
        namespaceInherited = true;
    }
}

