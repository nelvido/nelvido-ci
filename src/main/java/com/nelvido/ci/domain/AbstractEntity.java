package com.nelvido.ci.domain;

import java.io.Serializable;
import java.util.Date;

public class AbstractEntity implements Serializable {

    private static final long serialVersionUID = -172976996340010004L;

    private Long id;
    private User creator;
    private Date created;
    private User modifier;
    private Date modified;

}
