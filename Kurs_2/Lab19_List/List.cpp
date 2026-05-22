#include "List.h"

template <typename Datatype>
void List<Datatype>::delete_list() {
    shared_ptr<Node> t = first;
    first = first -> next;
    t -> prev = nullptr;
    t -> next = nullptr;
}