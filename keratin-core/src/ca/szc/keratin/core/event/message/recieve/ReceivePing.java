package ca.szc.keratin.core.event.message.recieve;

import net.engio.mbassy.bus.MBassador;
import ca.szc.keratin.core.event.IrcEvent;
import ca.szc.keratin.core.event.message.MessageRecieve;
import ca.szc.keratin.core.net.message.IrcMessage;

public class ReceivePing
    extends MessageRecieve
{
    public static final String COMMAND = "PING";
    
    public ReceivePing( MBassador<IrcEvent> bus, IrcMessage message )
    {
        super( bus, message );
    }
    
    // public ReceivePing( MBassador<IrcEvent> bus, String prefix, String server1, String server2 )
    // throws InvalidMessagePrefixException, InvalidMessageCommandException, InvalidMessageParamException
    // {
    // super( bus, new IrcMessage( prefix, COMMAND, server1, server2 ));
    // }

}
