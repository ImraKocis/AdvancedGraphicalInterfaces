package hr.algebra.advancedgraphicalinterface.lib.utils

import hr.algebra.advancedgraphicalinterface.lib.ToDo


fun getTodoData(): MutableList<ToDo> {

    return mutableListOf(
        ToDo(
            1,
            "Do something nice for someone I care about",
            false
        ),
        ToDo(
            2,
            "Memorize the fifty states and their capitals",
            false
        ),
        ToDo(
            3,
            "Watch a classic movie",
            false
        ),
        ToDo(
            4,
            "Contribute code or a monetary donation to an open-source software project",
            false
        ),
        ToDo(
            5,
            "Solve a Rubik's cube",
            false
        ),
        ToDo(
            6,
            "Bake pastries for me and neighbor",
            false
        ),
        ToDo(
            7,
            "Go see a Broadway production",
            false
        ),
        ToDo(
            8,
            "Write a thank you letter to an influential person in my life",
            false
        ),
    )
}