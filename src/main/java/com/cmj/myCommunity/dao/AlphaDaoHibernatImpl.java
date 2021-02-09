package com.cmj.myCommunity.dao;

import org.springframework.stereotype.Repository;

@Repository("alphaHibernat")
public class AlphaDaoHibernatImpl implements AlphaDao {

    @Override
    public String select() {
        return "Hibernat";
    }
}
