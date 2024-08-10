.data
	vet: .byte

.text 
	la $t0, vet
	
	li $v0, 5
	syscall
	move $t0, $v0
	
	addi $t1, $t0, 5
	
	


li $t3, 0 # acumulador de valores

imprime:
li $v0 , 1
lb $a0, ($t0)
syscall

add $t3, $t3, $a0

addi $t0, $t0, 1

blt $t0, $t1, imprime