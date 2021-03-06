/**
 * Redistribution and use of this software and associated documentation
 * ("Software"), with or without modification, are permitted provided
 * that the following conditions are met:
 *
 * 1. Redistributions of source code must retain copyright
 *    statements and notices.  Redistributions must also contain a
 *    copy of this document.
 *
 * 2. Redistributions in binary form must reproduce the
 *    above copyright notice, this list of conditions and the
 *    following disclaimer in the documentation and/or other
 *    materials provided with the distribution.
 *
 * 3. The name "Exolab" must not be used to endorse or promote
 *    products derived from this Software without prior written
 *    permission of Intalio, Inc.  For written permission,
 *    please contact info@exolab.org.
 *
 * 4. Products derived from this Software may not be called "Exolab"
 *    nor may "Exolab" appear in their names without prior written
 *    permission of Intalio, Inc. Exolab is a registered
 *    trademark of Intalio, Inc.
 *
 * 5. Due credit should be given to the Exolab Project
 *    (http://www.exolab.org/).
 *
 * THIS SOFTWARE IS PROVIDED BY INTALIO, INC. AND CONTRIBUTORS
 * ``AS IS'' AND ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT
 * NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL
 * INTALIO, INC. OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * Copyright 2002 (C) Intalio, Inc. All Rights Reserved.
 *
 * $Id: MapHandlers.java 8145 2009-03-29 22:07:00Z rjoachim $
 */


package org.exolab.castor.mapping.handlers;


import org.exolab.castor.mapping.MapHandler;

/**
 * A Map handler for adding and retreiving key-value pairs from
 * A map. A map handler is instantiated only once, must be thread
 * safe and not use any synchronization.
 *
 * @author <a href="mailto:kvisco@intalio.com">Keith Visco</a>
 * @version $Revision: 8145 $ $Date: 2005-03-05 06:42:06 -0700 (Sat, 05 Mar 2005) $
 */
public final class MapHandlers {
    private static final String J2MAP_CLASSNAME = "java.util.Map";
    
    private static final String J2MAP_HANDLER_CLASSNAME
        = "org.exolab.castor.mapping.handlers.J2MapHandler";

    private static final MapHandler HASHTABLE_HANDLER = new J1MapHandler();

    private static MapHandler _anymapHandler;

    private static Class _j2mapClass = null;

    static {
        if (_j2mapClass == null) {
            try {
                ClassLoader loader = MapHandlers.class.getClassLoader();
                if (loader != null) {
                    _j2mapClass = loader.loadClass(J2MAP_CLASSNAME);
                } else {
                    _j2mapClass = Class.forName(J2MAP_CLASSNAME);
                }
                Class handler = Class.forName(J2MAP_HANDLER_CLASSNAME);
                _anymapHandler = (MapHandler) handler.newInstance();
            } catch (ClassNotFoundException cnfe) {
                //-- Probably JDK 1.1 only
            } catch(InstantiationException ie) {
                //-- Probably shouldn't be here, but ignore
                //-- and only JDK 1.1 will be supported.
            } catch(IllegalAccessException iae) {
                //-- Probably shouldn't be here, but ignore
                //-- and only JDK 1.1 will be supported.
            }
        }
    }

    public static MapHandler getHandler(Object object) {
        if (object == null) return null;
        return getHandler(object.getClass());
    } //-- getHandler

    public static MapHandler getHandler(Class clazz) {

        if (clazz == null) return null;

        if (java.util.Hashtable.class.isAssignableFrom(clazz))
            return HASHTABLE_HANDLER;

        if (_j2mapClass != null) {
           if (_j2mapClass.isAssignableFrom(clazz))
                return _anymapHandler;
        }

        return null;
    } //-- getHandler


} //-- MapHandlers



