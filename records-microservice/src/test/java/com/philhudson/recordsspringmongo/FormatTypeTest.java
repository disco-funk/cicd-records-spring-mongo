package com.philhudson.recordsspringmongo;

import com.philhudson.recordsspringmongo.model.FormatType;
import com.philhudson.recordsspringmongo.repository.FormatTypeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FormatTypeTest {

	@Autowired
	private FormatTypeRepository repository;

	@Before
	public void setUp() {
		repository.deleteAll();

		repository.save(new FormatType("12\""));
		repository.save(new FormatType("7\""));
	}

	@Test
	public void shouldFindCorrectFormatType() {
		Assert.assertEquals(2, repository.findAll().size());

		Assert.assertEquals("12\"", repository.findByDescription("12\"").description);
	}
}