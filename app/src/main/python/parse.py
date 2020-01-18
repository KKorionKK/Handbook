# -*- coding: utf-8 -*-
from wiktionaryparser import WiktionaryParser
from pywiktionary import WiktionaryParserFactory


def wikiaParsing():
    parser_factory = WiktionaryParserFactory('en')
    pizza_parser = parser_factory.get_page('pizza')
    parsing_result = pizza_parser.parse()
    return parsing_result