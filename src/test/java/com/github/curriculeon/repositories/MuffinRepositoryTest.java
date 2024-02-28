package com.github.curriculeon.repositories;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.stereotype.Repository;

public class MuffinRepositoryTest {
    @Test
    public void testClassSignatureAnnotations(){
        Assert.assertTrue(MuffinRepository.class.isAnnotationPresent(Repository.class));
    }
}
