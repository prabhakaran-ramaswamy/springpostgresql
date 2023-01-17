package com.springpostgresql.model;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentityGenerator;

public class IdGenerator extends IdentityGenerator {

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		Object id=session.getEntityPersister(null, object).getClassMetadata().getIdentifier(object,session);
		return id!=null? id:super.generate(session, object);
	}
	
}
