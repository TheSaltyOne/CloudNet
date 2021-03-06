/*
 * Copyright (c) Tarek Hosni El Alaoui 2017
 */

package de.dytanic.cloudnet.bridge.event.proxied;

import de.dytanic.cloudnet.lib.server.info.ServerInfo;
import lombok.AllArgsConstructor;

/**
 * Called if the server info from one server was updated
 */
@AllArgsConstructor
public class ProxiedServerInfoUpdateEvent extends ProxiedCloudEvent {

    private ServerInfo serverInfo;

    public ServerInfo getServerInfo()
    {
        return serverInfo;
    }
}