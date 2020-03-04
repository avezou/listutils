package com.gconn.list.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ListUtilTests {

    @Test
    public void testGetListDiff() throws Exception {
        List<Long> list1 = Arrays.asList(1L, 2L, 3L, 5L);
        List<Long> list2 = Arrays.asList(4L, 5L, 3L);

        List<Long> diff = ListUtil.getListDiff(list1, list2);

        assert (diff.equals(Arrays.asList(1L, 2L, 4L)));
    }
}
