package com.thinkaurelius.titan.blueprints;

import com.thinkaurelius.titan.StorageSetup;
import com.thinkaurelius.titan.core.TitanGraph;
import com.thinkaurelius.titan.diskstorage.BackendException;

/**
 * @author Matthias Broecheler (me@matthiasb.com)
 */

public abstract class InMemoryBlueprintsTest extends TitanBlueprintsTest {


    @Override
    public void cleanUp() throws BackendException {

    }

    @Override
    public boolean supportsMultipleGraphs() {
        return false;
    }

    @Override
    public void beforeSuite() {

    }

    @Override
    public void afterSuite() {

    }

    @Override
    public TitanGraph generateGraph() {
        TitanGraph graph = StorageSetup.getInMemoryGraph();
        return graph;
    }

    @Override
    public TitanGraph generateGraph(String graphDirectoryName) {
        throw new UnsupportedOperationException();
    }


}
