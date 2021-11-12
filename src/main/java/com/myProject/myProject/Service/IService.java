package com.myProject.myProject.Service;

public interface IService <EntityType, ID>{

    EntityType create(EntityType entityType);
    EntityType read(ID id);
    EntityType update(ID id);
    boolean delete(ID id);

}
