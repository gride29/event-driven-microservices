package com.gride29.microservices.demo.elastic.index.client.service;

import com.gride29.microservices.demo.elastic.model.index.IndexModel;

import java.util.List;

public interface ElasticIndexClient<T extends IndexModel> {
    List<String> save(List<T> documents);
}
