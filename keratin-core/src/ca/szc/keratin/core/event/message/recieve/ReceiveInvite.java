package ca.szc.keratin.core.event.message.recieve;

import net.engio.mbassy.bus.MBassador;
import ca.szc.keratin.core.event.IrcEvent;
import ca.szc.keratin.core.event.message.MessageRecieve;
import ca.szc.keratin.core.net.message.IrcMessage;

public class ReceiveInvite
    extends MessageRecieve
{
    public static final String COMMAND = "INVITE";

    public ReceiveInvite( MBassador<IrcEvent> bus, IrcMessage message )
    {
        super( bus, message );
    }

    // public ReceiveInvite( MBassador<IrcEvent> bus, String prefix, String nick, String channel )
    // throws InvalidMessagePrefixException, InvalidMessageCommandException, InvalidMessageParamException
    // {
    // super( bus, new IrcMessage( prefix, COMMAND, nick, channel ) );
    // }
}
