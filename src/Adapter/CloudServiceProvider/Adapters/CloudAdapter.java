package Adapter.CloudServiceProvider.Adapters;

import Adapter.CloudServiceProvider.Model.Connection;

public interface CloudAdapter {
    Connection createConnection(long userId);
}
