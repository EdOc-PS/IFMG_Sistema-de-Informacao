.data 
	vetor: .byte 7, 12, 2, 99, 1
.text
	la $t0, vetor #primeiro endereco
	add $t1, $t0, 5	#iltimo endereco
	
	la $t3, 0 #acumulaor
	
imprime:
	li $v0, 1
	lb $a0, ($t0)
	syscall
	
	add $t3, $t3, $a0 
	
	addi $t0, $t0, 1
	
	sb $t3, -1($t0)
	
	blt $t0, $t1, imprime