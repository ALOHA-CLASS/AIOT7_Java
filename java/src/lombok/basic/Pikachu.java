package lombok.basic;

import lombok.Builder;
import lombok.Data;

@Data				// @Getter, @Setter, @ToString
					// @RequiredArgsConstructor
					// @EqualsHashCode
@Builder
public class Pikachu {

    int energy;
    String type;
    int level;


}
