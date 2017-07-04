package name

import spock.lang.Ignore
import spock.lang.Specification

class NameSpec extends Specification {

    @Ignore
    def 'set should contain the name that was added before'() {
        given:
        Set<Name> s = new HashSet<>()

        when:
        s.add(new Name("Mickey", "Mouse"))

        then:
        s.contains(new Name("Mickey", "Mouse"))
    }
}
