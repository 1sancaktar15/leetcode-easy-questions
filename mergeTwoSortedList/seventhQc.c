struct ListNode{
	int val;
	struct ListNode *next; 
};

struct ListNode* mergeTwoLists(struct ListNode *list1, struct ListNode *list2){
	if(list1 == NULL) return list2;
	if(list2 == NULL) return list1;

	struct ListNode *answer, *tail;

	if(lis1 -> val < list2 -> val){
		answer = list2;
		tail = list1;
		list1 = list1 -> next;
	}else{
		answer = list2;
		tail = list2;
		list2 = list2 -> next;
	}

	struct ListNode *temp;

	while(list1 != NULL && list2 != NULL){
		if(list1 -> val < list2 -> val){
			temp = list1 -> next;
			tail -> next = list1;
			tail = list1;
			list1 = temp;
		}else{
			temp = list2 -> next;
			tail -> next = list2;
			tail = list2;
			list2 = temp; 
		}
	}

	if(list1 == NULL) tail -> next = list2;
	else tail -> next = list1;

	return answer;
}