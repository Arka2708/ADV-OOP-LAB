# Q18. Use parameterized or nose_parameterized to compute power of following values:
#(2, 2, 4),(2, 3, 8),(1, 9, 1),(0, 9, 0). Use pytest to check errors.

import pytest
from parameterized import parameterized


@pytest.mark.parametrize("base, exponent, expected_result", [
    (2, 2, 4),
    (2, 3, 8),
    (1, 9, 1),
    (0, 9, 0)
])
def test_compute_power(base, exponent, expected_result):
    assert compute_power(base, exponent) == expected_result


def compute_power(base, exponent):
    return base ** exponent
