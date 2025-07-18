#!/bin/bash

# Writes TSV-formatted table to stdout.

if [ $# != 1 ]; then
    echo 'Must specify provider' >&2
    exit 1
fi

provider="$1"

for f in `find run/$provider -name '*.out'`; do echo $f >&2; tools/parse_test_results.pl --include-failed-test-numbers $f > $f.tsv || mv $f.tsv $f.tsv.failed; done
cat `find run/$provider -name '*.out.tsv'` | sort
