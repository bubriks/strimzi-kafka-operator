/*
 * Copyright Strimzi authors.
 * License: Apache License 2.0 (see the file LICENSE or http://apache.org/licenses/LICENSE-2.0.html).
 */
package io.strimzi.api.kafka.model.connector;

import io.fabric8.kubernetes.api.model.DefaultKubernetesResourceList;

/**
 * A {@code DefaultKubernetesResourceList<KafkaConnector>} required for using Fabric8 CRD support.
 */
public class KafkaConnectorList extends DefaultKubernetesResourceList<KafkaConnector> {
    private static final long serialVersionUID = 1L;
}
