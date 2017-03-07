package com.az.vlcoudtest;

import java.util.Collection;

/**
 * Aline representative for CI plugins
 */
@SuppressWarnings("unused")
public interface AlineApi {

    void uploadArtifacts(Collection<Artifact> artifacts) throws AlineException;

    void notifyAline(AlineMessage message) throws AlineException;

    // ...

    class Artifact {}
    class AlineMessage {}
    class AlineException extends Exception {}
}


