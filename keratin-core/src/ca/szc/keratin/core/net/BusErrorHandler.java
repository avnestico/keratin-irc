package ca.szc.keratin.core.net;

import org.pmw.tinylog.Logger;

import net.engio.mbassy.IPublicationErrorHandler;
import net.engio.mbassy.PublicationError;

/**
 * Logs PublicationErrors at error level
 */
public class BusErrorHandler
    implements IPublicationErrorHandler
{

    @Override
    public void handleError( PublicationError error )
    {
        Logger.error( error.toString() );
    }

}
