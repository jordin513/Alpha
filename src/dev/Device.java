package dev;
/*
 * Copyright (c) 2010, 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

import product.*;

/**
 * <h1>dev.Device Class</h1>
 * The <b>dev.Device</b> class extends the abstract class product.Product Unlike most other
 * functional interfaces, {@code Consumer} is expected to operate via side-effects.
 *
 * <p>This is a <a href="package-summary.html">class</a>
 * whose functional method is {@link #Device(String)}.
 *
 * @author Juan Gaviria
 * @version 0.1
 * @code product.Product prod1 = new Device("Product Name");
 * @serial
 * @since 0.1
 */

//The dev.Device class extends the Abstract product.Product Class.

public class Device extends Product {

  /**
   * Returns a composed {@code Device}. If performing either operation throws an exception, it is
   * relayed to the caller of the composed operation.  If performing this operation throws an
   * exception, the {@code Device} operation will not be performed.
   *
   * @throws NullPointerException if {@code Device} is null
   */
  public Device() {
  }

  /**
   * Returns a composed {@code Device}. If performing either operation throws an exception, it is
   * relayed to the caller of the composed operation.  If performing this operation throws an
   * exception, the {@code Device} operation will not be performed.
   *
   * @param name the operation to perform after this operation
   * @throws NullPointerException if {@code Device} is null
   */
  public Device(String name) {
    super(name);
  }
}