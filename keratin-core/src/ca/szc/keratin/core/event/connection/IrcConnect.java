/**
 * Copyright (C) 2013 Alexander Szczuczko
 *
 * This file may be modified and distributed under the terms
 * of the MIT license. See the LICENSE file for details.
 */
package ca.szc.keratin.core.event.connection;

import java.net.Socket;
import java.util.concurrent.BlockingQueue;

import ca.szc.keratin.core.event.IrcConnectionEvent;
import ca.szc.keratin.core.net.message.IrcMessage;

/**
 * Socket has connected
 */
public class IrcConnect
    extends IrcConnectionEvent
{

    public IrcConnect( BlockingQueue<IrcMessage> replyQueue, Socket socket )
    {
        super( replyQueue, socket );
    }

}
