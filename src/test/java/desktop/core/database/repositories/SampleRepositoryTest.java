package desktop.core.database.repositories;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

@SpringBootTest
public class SampleRepositoryTest {
  @Autowired
  private SampleRepository sampleRepository;

  @Test
  void findAll__databaseExists() {
    assertDoesNotThrow(() -> sampleRepository.findAll());
  }

  @Test
  void findAll__2records() {
    assertEquals(2, sampleRepository.findAll().size());
  }

  @Test
  void findAll__idAutoIncremented() {
    Sort sort = Sort.by(Direction.ASC, "id");
    var res = sampleRepository.findAll(sort);

    IntStream.range(0, res.size()).forEach(i -> assertEquals(i + 1, res.get(i).getId()));
  }
}
