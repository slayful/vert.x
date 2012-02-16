/*
 * Copyright 2011-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package vertx.tests.core.deploy;

import org.vertx.java.core.app.Verticle;
import org.vertx.java.core.eventbus.EventBus;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class ChildVerticle implements Verticle {

  private EventBus eb = EventBus.instance;

  @Override
  public void start() throws Exception {
    eb.send("test-handler", "started");
  }

  @Override
  public void stop() throws Exception {
    eb.send("test-handler", "stopped");
  }
}