package com.gitcodings.stack.billing.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class BillingRepo
{
    @Autowired
    public BillingRepo(NamedParameterJdbcTemplate template)
    {
    }
}
