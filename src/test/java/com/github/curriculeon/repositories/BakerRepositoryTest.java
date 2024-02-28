package com.github.curriculeon.repositories;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.stereotype.Repository;

public class BakerRepositoryTest {
    @Test
    public void testClassSignatureAnnotations(){
        Assert.assertTrue(BakerRepository.class.isAnnotationPresent(Repository.class));
    }
}
